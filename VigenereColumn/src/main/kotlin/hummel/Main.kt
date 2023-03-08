package hummel

import java.awt.BorderLayout
import java.awt.EventQueue
import java.awt.GridLayout
import java.io.File
import java.nio.charset.StandardCharsets
import java.util.*
import javax.swing.*
import javax.swing.border.EmptyBorder

fun main() {
    EventQueue.invokeLater {
        try {
            for (info in UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic" == info.name) {
                    UIManager.setLookAndFeel(info.className)
                    break
                }
            }
            val frame = GUI()
            frame.isVisible = true
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

class GUI : JFrame() {
    private var inputFile: File? = null
    private var outputFile: File? = null
    private var algorithm: String? = null

    private fun selectInputPath(inputFileField: JTextField) {
        val fileChooser = JFileChooser()
        val result = fileChooser.showOpenDialog(this)
        if (result == JFileChooser.APPROVE_OPTION) {
            inputFile = fileChooser.selectedFile
            inputFileField.text = fileChooser.selectedFile.absolutePath
        }
    }

    private fun selectOutputPath(outputFileField: JTextField) {
        val fileChooser = JFileChooser()
        val result = fileChooser.showSaveDialog(this)
        if (result == JFileChooser.APPROVE_OPTION) {
            outputFile = fileChooser.selectedFile
            outputFileField.text = fileChooser.selectedFile.absolutePath
        }
    }

    private fun encryptFile(
        textFieldKeyword: JTextField, textFieldInputPath: JTextField, textFieldOutputPath: JTextField
    ) {
        val outputPath = textFieldOutputPath.text
        val inputPath = textFieldInputPath.text

        if (inputPath.isEmpty() || outputPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select files", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }

        val inputText = inputFile!!.readText()
        val key = preprocess(textFieldKeyword.text)
        val msg = preprocess(inputText)

        if (key.isEmpty() || msg.isEmpty()) {
            JOptionPane.showMessageDialog(
                this, "Please enter a keyword and message", "Error", JOptionPane.ERROR_MESSAGE
            )
            return
        }
        var outputText = ""
        if (algorithm == "Column Method") {
            outputText = ColumnEncrypt.encryptColumn(msg, key, false)
        } else if (algorithm == "Vigenere") {
            outputText = VigenereEncrypt.encryptVigenere(msg, key)
        }
        outputFile!!.writeText(outputText)
        JOptionPane.showMessageDialog(this, "Encryption complete", "Message", JOptionPane.INFORMATION_MESSAGE)
    }

    private fun decryptFile(
        textFieldKeyword: JTextField, textFieldInputPath: JTextField, textFieldOutputPath: JTextField
    ) {
        val outputPath = textFieldOutputPath.text
        val inputPath = textFieldInputPath.text

        if (inputPath.isEmpty() || outputPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select files", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }

        val inputText = inputFile!!.readText()
        val key = preprocess(textFieldKeyword.text)
        val msg = preprocess(inputText)

        if (key.isEmpty() || msg.isEmpty()) {
            JOptionPane.showMessageDialog(
                this, "Please enter a keyword and message", "Error", JOptionPane.ERROR_MESSAGE
            )
            return
        }
        var outputText = ""
        if (algorithm == "Column Method") {
            outputText = ColumnDecrypt.decryptColumn(msg, key, false)
        } else if (algorithm == "Vigenere") {
            outputText = VigenereDecrypt.decryptVigenere(msg, key)
        }
        outputFile!!.writeText(outputText)
        JOptionPane.showMessageDialog(this, "Decryption complete", "Message", JOptionPane.INFORMATION_MESSAGE)
    }

    init {
        title = "File Encryption"
        defaultCloseOperation = EXIT_ON_CLOSE
        setBounds(100, 100, 450, 300)

        val panelContent = JPanel()
        panelContent.border = EmptyBorder(5, 5, 5, 5)
        panelContent.layout = BorderLayout(0, 0)
        contentPane = panelContent

        val panelInput = JPanel()
        val elemInput1 = JLabel("Input path:")
        val elemInput2 = JTextField(20)
        val elemInput3 = JButton("Select path")
        elemInput3.addActionListener { selectInputPath(elemInput2) }
        panelInput.add(elemInput1)
        panelInput.add(elemInput2)
        panelInput.add(elemInput3)

        val panelKey = JPanel()
        panelKey.layout = GridLayout(0, 1, 0, 0)
        val elemKey1 = JLabel("Keyword:")
        val elemKey2 = JTextField(20)
        val elemKey3 = JLabel("Algorithm:")
        val elemKey4 = JRadioButton("Column Method")
        val elemKey5 = JRadioButton("Vigenere")
        elemKey4.addActionListener { algorithm = "Column Method" }
        elemKey5.addActionListener { algorithm = "Vigenere" }
        panelKey.add(elemKey1)
        panelKey.add(elemKey2)
        panelKey.add(elemKey3)
        panelKey.add(elemKey4)
        panelKey.add(elemKey5)

        val panelOutput = JPanel()
        val elemOutput1 = JLabel("Output path:")
        val elemOutput2 = JTextField(20)
        val elemOutput3 = JButton("Select path")
        elemOutput3.addActionListener { selectOutputPath(elemInput2) }
        panelOutput.add(elemOutput1)
        panelOutput.add(elemOutput2)
        panelOutput.add(elemOutput3)

        val panelButtons = JPanel()
        panelButtons.layout = GridLayout(0, 1, 0, 0)
        panelButtons.border = EmptyBorder(0, 5, 0, 0)
        val elemButtons1 = JButton("Encrypt")
        val elemButtons2 = JButton("Decrypt")
        elemButtons1.addActionListener { encryptFile(elemKey2, elemInput2, elemOutput2) }
        elemButtons2.addActionListener { decryptFile(elemKey2, elemInput2, elemOutput2) }
        panelButtons.add(elemButtons1)
        panelButtons.add(elemButtons2)

        panelContent.add(panelInput, BorderLayout.NORTH)
        panelContent.add(panelKey, BorderLayout.CENTER)
        panelContent.add(panelOutput, BorderLayout.SOUTH)
        panelContent.add(panelButtons, BorderLayout.EAST)

        setLocationRelativeTo(null)
    }

    companion object {
        const val ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"

        fun preprocess(str: String): String {
            val upper = str.uppercase(Locale.getDefault())
            return upper.filter { it in ALPHABET }
        }
    }
}