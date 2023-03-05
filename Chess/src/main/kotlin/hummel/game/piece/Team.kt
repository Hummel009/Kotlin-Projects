package main.kotlin.hummel.game.piece

import java.io.Serializable

enum class Team : Serializable {
	WHITE {
		override fun toString(): String {
			return "White"
		}
	},
	BLACK {
		override fun toString(): String {
			return "Black"
		}
	},
	NO_COLOR {
		override fun toString(): String {
			return "No Color"
		}
	}
}