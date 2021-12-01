package com.LabProject;

import com.LabProject.Game.User;
import com.LabProject.Items.ItemData;

public class App {

	public static void main(String[] args) {

		User user = new User();
		user.playerIntro();
		ItemData.init();
		user.gamePlay();

	}

}
