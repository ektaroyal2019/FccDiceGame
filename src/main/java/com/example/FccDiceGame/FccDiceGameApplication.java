package com.example.FccDiceGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
public class FccDiceGameApplication {

	public static void main(String[] args) {

		SpringApplication.run(FccDiceGameApplication.class, args);
		PlayDiceGame playGame;
		Integer score;
		Integer existingValue;
		Map<Integer,Integer> resultMap = new ConcurrentHashMap<Integer,Integer>(30);
		//Initialize map with 0 score
		for(int i=0;i<=30;i++){
			resultMap.put(i,0);
		}
		int maxIterations = 10000;
		for(int i=0;i<maxIterations;i++){
			playGame = new PlayDiceGame();
			score = playGame.play();
			existingValue = resultMap.get(score);
			resultMap.put(score,existingValue+1);

		}
		//print all occurrences
		for(int i=0;i<=30;i++){
			System.out.println("Total " + i + " occurs " + resultMap.get(i) + " times");
		}

	}

}
