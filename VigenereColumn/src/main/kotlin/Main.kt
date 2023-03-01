package main.java.hummel

import java.awt.BorderLayout
import java.awt.EventQueue
import java.awt.GridLayout
import java.io.File
import java.nio.charset.StandardCharsets
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
        val key = preprocess(keyword)
        val outputPath = textFieldOutputPath.text
        if (inputFile == null) {
            JOptionPane.showMessageDialog(this, "Please select a file to encrypt", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        if (outputPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an output path", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        val inputText = readFile(inputFile!!)
        val msg = preprocess(inputText)
        if (key.isEmpty() || msg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a keyword and message", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        var outputText = ""
        if (algorithm == "Column Method") {
            outputText = ColumnEncrypt.encryptColumn(msg, key, false)
        } else if (algorithm == "Vigenere") {
            outputText = VigenereEncrypt.encryptVigenere(msg, key)
        }
        writeFile(outputFile!!, outputText)
        JOptionPane.showMessageDialog(this, "Encryption complete", "Message", JOptionPane.INFORMATION_MESSAGE)
    }

    private fun decryptFile() {
        val keyword = textFieldKeyword.text
        val key = preprocess(keyword)
        val outputPath = textFieldOutputPath.text
        if (inputFile == null) {
            JOptionPane.showMessageDialog(this, "Please select a file to decrypt", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        if (outputPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an output path", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        val inputText = readFile(inputFile!!)
        val msg = preprocess(inputText)
        if (key.isEmpty() || msg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a keyword and message", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }
        var outputText = ""
        if (algorithm == "Column Method") {
            outputText = ColumnDecrypt.decryptColumn(msg, key, false)
        } else if (algorithm == "Vigenere") {
            outputText = VigenereDecrypt.decryptVigenere(msg, key)
        }
        writeFile(outputFile!!, outputText)
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

    private fun readFile(file: File): String {
        val reader = file.bufferedReader(StandardCharsets.UTF_8)
        val sb = StringBuilder()
        var line: String?
        while (reader.readLine().also { line = it } != null) {
            sb.append(line)
        }
        reader.close()
        return sb.toString()
    }

    private fun writeFile(file: File, text: String) {
        val writer = file.bufferedWriter(StandardCharsets.UTF_8)
        writer.write(text)
        writer.close()
    }

    companion object {
        const val ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"

        @JvmStatic
        fun main(args: Array<String>) {
            EventQueue.invokeLater {
                try {
                    for (info in UIManager.getInstalledLookAndFeels()) {
                        if ("Windows Classic" == info.name) {
                            UIManager.setLookAndFeel(info.className)
                            break
                        }
                    }
                    val frame = FileEncryptionGUI()
                    frame.isVisible = true
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }

        fun preprocess(str: String): String {
            val upper = str.uppercase(Locale.getDefault())
            return upper.filter { it in ALPHABET }
        }
    }
}