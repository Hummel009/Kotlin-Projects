package hummel

import java.awt.BorderLayout
import java.awt.EventQueue
import java.awt.GridLayout
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

    private fun processButton(textFieldInputPath: JTextField, textFieldOutputPath: JTextField) {
        val outputPath = textFieldOutputPath.text
        val inputPath = textFieldInputPath.text

        if (inputPath.isEmpty() || outputPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select files", "Error", JOptionPane.ERROR_MESSAGE)
            return
        }

        val inputText = inputFile!!.readText()
        val parser = Parser()
        val outputText = parser.getInfo(inputText)
        outputFile!!.writeText(outputText)
        JOptionPane.showMessageDialog(this, "Calculation complete", "Message", JOptionPane.INFORMATION_MESSAGE)
    }

    init {
        title = "Holsted Metrics"
        defaultCloseOperation = EXIT_ON_CLOSE
        setBounds(100, 100, 450, 200)

        val panelContent = JPanel()
        panelContent.border = EmptyBorder(5, 5, 5, 5)
        panelContent.layout = BorderLayout(0, 0)
        panelContent.layout = GridLayout(0, 1, 0, 0)
        contentPane = panelContent

        val panelInput = JPanel()

        val elemInput1 = JLabel("Input path:")
        val elemInput2 = JTextField(20)
        val elemInput3 = JButton("Select path")
        elemInput3.addActionListener { selectInputPath(elemInput2) }
        panelInput.add(elemInput1)
        panelInput.add(elemInput2)
        panelInput.add(elemInput3)

        val panelOutput = JPanel()
        val elemOutput1 = JLabel("Output path:")
        val elemOutput2 = JTextField(20)
        val elemOutput3 = JButton("Select path")
        elemOutput3.addActionListener { selectOutputPath(elemInput2) }
        panelOutput.add(elemOutput1)
        panelOutput.add(elemOutput2)
        panelOutput.add(elemOutput3)

        val panelProcess = JPanel()
        val elemProcess1 = JLabel()
        val elemProcess2 = JButton("Process")
        val elemProcess3 = JLabel()
        elemProcess2.addActionListener { processButton(elemInput2, elemOutput2) }
        panelProcess.add(elemProcess1)
        panelProcess.add(elemProcess2)
        panelProcess.add(elemProcess3)

        panelContent.add(panelInput)
        panelContent.add(panelOutput)
        panelContent.add(panelProcess)

        setLocationRelativeTo(null)
    }
}