package main.kotlin.hummel

import java.awt.Dimension
import java.awt.EventQueue
import java.awt.FlowLayout
import java.io.File
import javax.swing.*

class MyFrame : JFrame() {
	private val inputFileButton: JButton = JButton("Выбрать входной файл")
	private val outputFileButton: JButton = JButton("Выбрать выходной файл")
	private val processButton: JButton = JButton("Обработать текст")
	private val inputFileLabel = JLabel("Input File:")
	private val inputFileField = JTextField(30)

	private val outputFileLabel = JLabel("Output File:")
	private val outputFileField = JTextField(30)

	private var inputText: String? = null
	private var outputText: String? = null
	private var inputFile: File? = null
	private var outputFile: File? = null

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
		inputText = inputFile?.readText()
		val session = Parser()
		outputText = session.getInfo(inputText!!)
		outputFile?.writeText(outputText!!)
	}

	init {
		defaultCloseOperation = EXIT_ON_CLOSE
		size = Dimension(500, 250)
		layout = FlowLayout(FlowLayout.CENTER, 3, 3)

		inputFileButton.addActionListener { inputFileButton() }
		add(inputFileLabel)
		add(inputFileField)
		add(inputFileButton)

		outputFileButton.addActionListener { outputFileButton() }
		add(outputFileLabel)
		add(outputFileField)
		add(outputFileButton)

		processButton.addActionListener { processButton() }
		add(processButton)

		setLocationRelativeTo(null)
	}

	companion object {
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
					val frame = MyFrame()
					frame.isVisible = true
				} catch (e: Exception) {
					e.printStackTrace()
				}
			}
		}
	}
}