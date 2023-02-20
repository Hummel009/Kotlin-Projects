package main.java.hummel

import java.awt.BorderLayout
import java.awt.EventQueue
import java.awt.GridLayout
import java.io.*
import java.util.*
import javax.swing.*
import javax.swing.border.EmptyBorder

class FileEncryptionGUI : JFrame() {
    private val contentPane: JPanel
    private val textFieldFilePath: JTextField
    private val textFieldKeyword: JTextField
    private val textFieldOutputPath: JTextField
    private val btnColumnMethod: JRadioButton
    private val btnVigenere: JRadioButton
    private val btnSelectFile: JButton
    private val btnEncrypt: JButton
    private val btnDecrypt: JButton
    private val btnOutputPath: JButton
    private var inputFile: File? = null
    private var outputFile: File? = null
    private var algorithm: String? = null

    private fun selectFile() {
        val fileChooser = JFileChooser()
        val result = fileChooser.showOpenDialog(this)
        if (result == JFileChooser.APPROVE_OPTION) {
            inputFile = fileChooser.selectedFile
            textFieldFilePath.text = inputFile!!.absolutePath
        }
    }

    private fun selectOutputPath() {
        val fileChooser = JFileChooser()
        val result = fileChooser.showSaveDialog(this)
        if (result == JFileChooser.APPROVE_OPTION) {
            outputFile = fileChooser.selectedFile
            textFieldOutputPath.text = outputFile!!.absolutePath
        }
    }

    private fun encryptFile() {
        val keyword = textFieldKeyword.text
        val outputPath = textFieldOutputPath.text
        if (inputFile == null) {
            JOptionPane.showMessageDialog(this, "Please select a file to encrypt", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a keyword and key", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        if (outputPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an output path", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        val inputText = readFile(inputFile!!)
        println("INPUT $inputText")
        var outputText = ""
        if (algorithm == "Column Method") {
            outputText = encryptColumnMethod(inputText, keyword)
        } else if (algorithm == "Vigenere") {
            outputText = encryptVigenere(inputText, keyword)
        }
        println("OUTPUT $outputText")
        writeFile(outputFile, outputText)
        JOptionPane.showMessageDialog(this, "Encryption complete", "Message", JOptionPane.INFORMATION_MESSAGE)
    }

    private fun decryptFile() {
        val keyword = textFieldKeyword.text
        val outputPath = textFieldOutputPath.text
        if (inputFile == null) {
            JOptionPane.showMessageDialog(this, "Please select a file to decrypt", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a keyword and key", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        if (outputPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an output path", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        val inputText = readFile(inputFile!!)
        println("INPUT $inputText")
        var outputText = ""
        if (algorithm == "Column Method") {
            outputText = decryptColumnMethod(inputText, keyword)
        } else if (algorithm == "Vigenere") {
            outputText = decryptVigenere(inputText, keyword)
        }
        println("OUTPUT $outputText")
        writeFile(outputFile, outputText)
        JOptionPane.showMessageDialog(this, "Decryption complete", "Message", JOptionPane.INFORMATION_MESSAGE)
    }

    init {
        title = "File Encryption"
        defaultCloseOperation = EXIT_ON_CLOSE
        setBounds(100, 100, 450, 300)
        contentPane = JPanel()
        contentPane.border = EmptyBorder(5, 5, 5, 5)
        setContentPane(contentPane)
        contentPane.layout = BorderLayout(0, 0)
        val panelFile = JPanel()
        contentPane.add(panelFile, BorderLayout.NORTH)
        val lblFilePath = JLabel("Input path:")
        panelFile.add(lblFilePath)
        textFieldFilePath = JTextField()
        panelFile.add(textFieldFilePath)
        textFieldFilePath.columns = 20
        btnSelectFile = JButton("Select path")
        btnSelectFile.addActionListener { selectFile() }
        panelFile.add(btnSelectFile)
        val panelKey = JPanel()
        contentPane.add(panelKey, BorderLayout.CENTER)
        panelKey.layout = GridLayout(0, 1, 0, 0)
        val lblKeyword = JLabel("Keyword:")
        panelKey.add(lblKeyword)
        textFieldKeyword = JTextField()
        panelKey.add(textFieldKeyword)
        textFieldKeyword.columns = 20
        val lblAlgorithm = JLabel("Algorithm:")
        panelKey.add(lblAlgorithm)
        btnColumnMethod = JRadioButton("Column Method")
        btnColumnMethod.addActionListener { algorithm = "Column Method" }
        panelKey.add(btnColumnMethod)
        btnVigenere = JRadioButton("Vigenere")
        btnVigenere.addActionListener { algorithm = "Vigenere" }
        panelKey.add(btnVigenere)
        val panelOutput = JPanel()
        contentPane.add(panelOutput, BorderLayout.SOUTH)
        val lblOutputPath = JLabel("Output path:")
        panelOutput.add(lblOutputPath)
        textFieldOutputPath = JTextField()
        panelOutput.add(textFieldOutputPath)
        textFieldOutputPath.columns = 20
        btnOutputPath = JButton("Select path")
        btnOutputPath.addActionListener { selectOutputPath() }
        panelOutput.add(btnOutputPath)
        val panelButtons = JPanel()
        contentPane.add(panelButtons, BorderLayout.EAST)
        panelButtons.layout = GridLayout(0, 1, 0, 0)
        btnEncrypt = JButton("Encrypt")
        btnEncrypt.addActionListener { encryptFile() }
        panelButtons.add(btnEncrypt)
        btnDecrypt = JButton("Decrypt")
        btnDecrypt.addActionListener { decryptFile() }
        panelButtons.add(btnDecrypt)
        setLocationRelativeTo(null)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            EventQueue.invokeLater {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
                    val frame = FileEncryptionGUI()
                    frame.isVisible = true
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }

        private fun readFile(file: File): String {
            val sb = StringBuilder()
            try {
                val scanner = Scanner(file)
                while (scanner.hasNextLine()) {
                    var line = scanner.nextLine()
                    line = line.replace("[^а-яА-Я]".toRegex(), "")
                    sb.append(line)
                }
                scanner.close()
            } catch (e: FileNotFoundException) {
                e.printStackTrace()
            }
            return sb.toString()
        }

        private fun writeFile(file: File?, text: String) {
            try {
                val writer = BufferedWriter(FileWriter(file!!))
                writer.write(text)
                writer.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }

        private const val ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
        fun encryptColumnMethod(input: String, key: String): String {
            val output = StringBuilder()
            for (i in input.indices) {
                val c = input[i]
                val index = ALPHABET.indexOf(c.lowercaseChar())
                if (index != -1) {
                    val keyIndex = i % key.length
                    val keyChar = key[keyIndex]
                    val keyCharIndex = ALPHABET.indexOf(keyChar.lowercaseChar())
                    var newIndex = (index + keyCharIndex) % ALPHABET.length
                    if (newIndex < 0) {
                        newIndex += ALPHABET.length
                    }
                    val newChar = ALPHABET[newIndex]
                    if (Character.isUpperCase(c)) {
                        output.append(newChar.uppercaseChar())
                    } else {
                        output.append(newChar)
                    }
                } else {
                    output.append(c)
                }
            }
            return output.toString()
        }

        fun decryptColumnMethod(input: String, key: String): String {
            val output = StringBuilder()
            for (i in input.indices) {
                val c = input[i]
                val keyIndex = i % key.length
                val keyChar = key[keyIndex]
                val keyCharIndex = ALPHABET.indexOf(keyChar.lowercaseChar())
                val index = ALPHABET.indexOf(c.lowercaseChar())
                if (index != -1) {
                    var newIndex = (index - keyCharIndex + ALPHABET.length) % ALPHABET.length
                    if (newIndex < 0) {
                        newIndex += ALPHABET.length
                    }
                    val newChar = ALPHABET[newIndex]
                    if (Character.isUpperCase(c)) {
                        output.append(newChar.uppercaseChar())
                    } else {
                        output.append(newChar)
                    }
                } else {
                    output.append(c)
                }
            }
            return output.toString()
        }

        private const val ALPHABET_SIZE = 33
        fun encryptVigenere(input: String, key: String): String {
            val keyIndices = IntArray(input.length)
            for (i in input.indices) {
                keyIndices[i] = key[i % key.length].code - 'а'.code
            }
            val result = StringBuilder()
            var i = 0
            var j = 0
            while (i < input.length) {
                val c = input[i]
                if (Character.isLetter(c)) {
                    val cIndex = c.code - 'а'.code
                    val kIndex = keyIndices[j]
                    val encryptedIndex = (cIndex + kIndex) % ALPHABET_SIZE
                    val encryptedChar = (encryptedIndex + 'а'.code).toChar()
                    result.append(encryptedChar)
                    j = (j + 1) % keyIndices.size
                } else {
                    result.append(c)
                }
                i++
            }
            return result.toString()
        }

        fun decryptVigenere(input: String, key: String): String {
            val keyIndices = IntArray(input.length)
            for (i in input.indices) {
                keyIndices[i] = key[i % key.length].code - 'а'.code
            }
            val result = StringBuilder()
            var i = 0
            var j = 0
            while (i < input.length) {
                val c = input[i]
                if (Character.isLetter(c)) {
                    val cIndex = c.code - 'а'.code
                    val kIndex = keyIndices[j]
                    val decryptedIndex = (cIndex - kIndex + ALPHABET_SIZE) % ALPHABET_SIZE
                    val decryptedChar = (decryptedIndex + 'а'.code).toChar()
                    result.append(decryptedChar)
                    j = (j + 1) % keyIndices.size
                } else {
                    result.append(c)
                }
                i++
            }
            return result.toString()
        }
    }
}