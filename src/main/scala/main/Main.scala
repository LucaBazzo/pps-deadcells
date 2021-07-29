package main

import com.badlogic.gdx.backends.lwjgl3.{Lwjgl3Application, Lwjgl3ApplicationConfiguration}
import view.MainView

object Main {

  private val ICON_PATH = "Sprites/" + "icon_32x32.png"
  private val TITLE = "Man-Pac"

  def main(args:Array[String]): Unit = {
    print("Hello World!")

    val config = new Lwjgl3ApplicationConfiguration

    config.setTitle(TITLE)
    //config.addIcon(ICON_PATH, FileType.Internal)
    new Lwjgl3Application(new MainView(), config)
  }

}
