package com.kh.personalProject;

public class PlayerController {
	private int size = 11;
	private Player[] playerList = new Player[this.size];
	
	public int existPlayerNum() {
		int count = 0;
		for(int i = 0; i < this.playerList.length; i++) {
			if(this.playerList[i] != null)
				count++;
		}
		return count;
	}
	
	public boolean checkId(String position) {
		for(int i = 0; i < playerList.length; i++) {
			if (playerList[i] != null && playerList[i].getPosition().equals(position)) 
				return true;
		}
		return false;
	}
	
	public void insertPlayer(String position, String name, String nationality, String team, String birth, char gender,
							int age, double height, double weight, int annualSalary) {
		for(int i = 0; i < this.playerList.length; i++) {
			if(this.playerList[i] == null) {
				this.playerList[i] = new Player(position, name, nationality, team, birth, gender,
												age, height, weight, annualSalary);
			}
		}
	}
	
	public String searchPosition(String position) {
		for(Player player : playerList) {
			if (player != null && player.getPosition().equals(position))
				return player.information();
		}
		return "존재하지 않는 포지션입니다.";
	}
	
	public Player[] searchName(String name) {
		int count = 0;
        for (Player player : playerList) {
            if (player != null && player.getName().equals(name)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Player[] result = new Player[count];
        int index = 0;
        for (Player player : playerList) {
            if (player != null && player.getName().equals(name)) {
                result[index++] = player;
            }
        }
        return result;
	}

	public boolean updatePosition(String position, String name) {
		for(int i = 0; i < this.playerList.length; i++) {
			if (playerList[i] != null && playerList[i].getPosition().equals(position)) {
				Player.setName(name);
				return true;
			}
		}
	}
	
}
