package hummel

import java.awt.*
import java.io.File
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
            val frame = MyFrame()
            frame.isVisible = true
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

class MyFrame : JFrame() {
    private val inputFileButton: JButton = JButton("Выбрать входной файл")
    private val outputFileButton: JButton = JButton("Выбрать выходной файл")
    private val processButton: JButton = JButton("Обработать текст")
    private val inputFileLabel = JLabel("Input File:")
    private val inputFileField = JTextField(30)

    private val outputFileLabel = JLabel("Output File:")
    private val outputFileField = JTextField(30)

    private lateinit var inputText: String
    private lateinit var outputText: String
    private lateinit var inputFile: File
    private lateinit var outputFile: File

    private fun inputFileButton() {
        val fileChooser = JFileChooser()
        val result = fileChooser.showOpenDialog(this)
        if (result == JFileChooser.APPROVE_OPTION) {
            inputFile = fileChooser.selectedFile
            inputFileField.text = fileChooser.selectedFile.absolutePath
        }
    }

    private fun outputFileButton() {
        val fileChooser = JFileChooser()
        val result = fileChooser.showSaveDialog(this)
        if (result == JFileChooser.APPROVE_OPTION) {
            outputFile = fileChooser.selectedFile
            outputFileField.text = fileChooser.selectedFile.absolutePath
        }
    }

    private fun processButton() {
        inputText = inputFile.readText()
        val session = Parser()
        outputText = session.getInfo(inputText)
        outputFile.writeText(outputText)
        JOptionPane.showMessageDialog(this, "Calculated!", "Message", JOptionPane.INFORMATION_MESSAGE)
    }

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        size = Dimension(600, 200)
        layout = GridLayout(3, 3, 10, 10)

        val content = JPanel()
        content.border = EmptyBorder(5, 5, 5, 5)
        contentPane = content

        inputFileButton.addActionListener { inputFileButton() }
        contentPane.add(inputFileLabel)
        contentPane.add(inputFileField)
        contentPane.add(inputFileButton)

        outputFileButton.addActionListener { outputFileButton() }
        contentPane.add(outputFileLabel)
        contentPane.add(outputFileField)
        contentPane.add(outputFileButton)

        processButton.addActionListener { processButton() }
        contentPane.add(JLabel())
        contentPane.add(processButton)
        contentPane.add(JLabel())

        setLocationRelativeTo(null)
    }
}