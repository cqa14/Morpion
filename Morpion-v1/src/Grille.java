import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Grille {

	int fcot;
	String name;
	
	boolean player = true;
	
	boolean fill1 = true;
	boolean fill2 = true;
	boolean fill3 = true;
	boolean fill4 = true;
	boolean fill5 = true;
	boolean fill6 = true;
	boolean fill7 = true;
	boolean fill8 = true;
	boolean fill9 = true;
	
	int pos1 = 100;
	int pos2 = 200;
	int pos3 = 300;
	int pos4 = 400;
	int pos5 = 500;
	int pos6 = 600;
	int pos7 = 700;
	int pos8 = 800;
	int pos9 = 900;

	public Grille(String name, int fcot) {

		this.fcot = fcot;
		this.name = name;
		
		JFrame frame = new JFrame(name);
		
		JPanel pannel = new JPanel();
		
		pannel.setBounds(fcot/5, fcot/5, fcot-(fcot/10), fcot-(fcot/10));
		pannel.setBackground(Color.BLACK);
		
		JPanel blueWin = new JPanel();
		blueWin.setBackground(Color.BLUE);
		blueWin.setBounds(fcot/5, fcot/5, fcot-(fcot/10), fcot-(fcot/10));
		JButton winBlue = new JButton("Blue Win !");
		winBlue.setBackground(Color.WHITE);
		blueWin.add(winBlue);
		
		JPanel redWin = new JPanel();
		redWin.setBackground(Color.RED);
		redWin.setBounds(fcot/5, fcot/5, fcot-(fcot/10), fcot-(fcot/10));
		JButton winRed = new JButton("Red Win !");
		winRed.setBackground(Color.WHITE);
		redWin.add(winRed);
		
		JPanel equality = new JPanel();
		equality.setBackground(Color.WHITE);
		equality.setBounds(fcot/5, fcot/5, fcot-(fcot/10), fcot-(fcot/10));
		JButton winNobody = new JButton("Null...");
		winNobody.setBackground(Color.BLACK);
		equality.add(winNobody);
		
		JButton case1 = new JButton();
		case1.setBounds(0, 0, fcot/3, fcot/3);
		case1.setBackground(Color.WHITE);
		frame.add(case1);
		
		JButton case2 = new JButton();
		case2.setBounds(fcot/3, 0, fcot/3, fcot/3);
		case2.setBackground(Color.WHITE);
		frame.add(case2);
		
		JButton case3 = new JButton();
		case3.setBounds(2*(fcot/3), 0, fcot/3, fcot/3);
		case3.setBackground(Color.WHITE);
		frame.add(case3);
		
		JButton case4 = new JButton();
		case4.setBounds(0, fcot/3, fcot/3, fcot/3);
		case4.setBackground(Color.WHITE);
		frame.add(case4);
		
		JButton case5 = new JButton();
		case5.setBounds(fcot/3, fcot/3, fcot/3, fcot/3);
		case5.setBackground(Color.WHITE);
		frame.add(case5);
		
		JButton case6 = new JButton();
		case6.setBounds(2*(fcot/3), fcot/3, fcot/3, fcot/3);
		case6.setBackground(Color.WHITE);
		frame.add(case6);
		
		JButton case7 = new JButton();
		case7.setBounds(0, 2*(fcot/3), fcot/3, fcot/3);
		case7.setBackground(Color.WHITE);
		frame.add(case7);
		
		JButton case8 = new JButton();
		case8.setBounds(fcot/3, 2*(fcot/3), fcot/3, fcot/3);
		case8.setBackground(Color.WHITE);
		frame.add(case8);
		
		JButton case9 = new JButton();
		case9.setBounds(2*(fcot/3), 2*(fcot/3), fcot/3, fcot/3);
		case9.setBackground(Color.WHITE);
		frame.add(case9);
		
		case1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fill1 == true) {
					if(player == true) {
						case1.setBackground(Color.BLUE);
						
						player = false;
						fill1 = false;
						pos1 = 1;
					}
					else{
						case1.setBackground(Color.RED);
						
						player = true;
						fill1 = false;
						pos1 = 2;
					}
				}
				
				if(pos1 == pos2 && pos1 == pos3) {
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){			
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos4 && pos1 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos5 && pos1 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos2 == pos5 && pos2 == pos8){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos2 == 1){
						frame.add(blueWin);
					}
					else if(pos2 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos6 && pos3 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos5 && pos3 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos4 == pos5 && pos4 == pos6){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos4 == 1){
						frame.add(blueWin);
					}
					else if(pos4 == 2){
						frame.add(redWin);
					}
				}
				else if(pos7 == pos8 && pos7 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos7 == 1){
						frame.add(blueWin);
					}
					else if(pos7 == 2){
						frame.add(redWin);
					}
				}
				else if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					frame.add(equality);
					
				}
				
				if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false) {
					frame.remove(case1);
					frame.remove(case2);
					frame.remove(case3);
					frame.remove(case4);
					frame.remove(case5);
					frame.remove(case6);
					frame.remove(case7);
					frame.remove(case8);
					frame.remove(case9);
					frame.remove(pannel);
					
					frame.invalidate();
					frame.validate();
				}
			}});
		
		case2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fill2 == true) {
					if(player == true) {
						case2.setBackground(Color.BLUE);
						
						player = false;
						fill2 = false;
						pos2 = 1;
					}
					else{
						case2.setBackground(Color.RED);
						
						player = true;
						fill2 = false;
						pos2 = 2;
					}
				}
				if(pos1 == pos2 && pos1 == pos3) {
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos4 && pos1 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos5 && pos1 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos2 == pos5 && pos2 == pos8){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos2 == 1){
						frame.add(blueWin);
					}
					else if(pos2 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos6 && pos3 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos5 && pos3 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos4 == pos5 && pos4 == pos6){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos4 == 1){
						frame.add(blueWin);
					}
					else if(pos4 == 2){
						frame.add(redWin);
					}
				}
				else if(pos7 == pos8 && pos7 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos7 == 1){
						frame.add(blueWin);
					}
					else if(pos7 == 2){
						frame.add(redWin);
					}
				}
				else if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					frame.add(equality);
					
				}
				if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false) {
					frame.remove(case1);
					frame.remove(case2);
					frame.remove(case3);
					frame.remove(case4);
					frame.remove(case5);
					frame.remove(case6);
					frame.remove(case7);
					frame.remove(case8);
					frame.remove(case9);
					frame.remove(pannel);
					
					frame.invalidate();
					frame.validate();
				}
			}});
		
		case3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fill3 == true) {
					if(player == true) {
						case3.setBackground(Color.BLUE);
						
						player = false;
						fill3 = false;
						pos3 = 1;
					}
					else{
						case3.setBackground(Color.RED);
						
						player = true;
						fill3 = false;
						pos3 = 2;
					}
				}
				if(pos1 == pos2 && pos1 == pos3) {
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos4 && pos1 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos5 && pos1 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos2 == pos5 && pos2 == pos8){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos2 == 1){
						frame.add(blueWin);
					}
					else if(pos2 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos6 && pos3 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos5 && pos3 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos4 == pos5 && pos4 == pos6){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos4 == 1){
						frame.add(blueWin);
					}
					else if(pos4 == 2){
						frame.add(redWin);
					}
				}
				else if(pos7 == pos8 && pos7 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos7 == 1){
						frame.add(blueWin);
					}
					else if(pos7 == 2){
						frame.add(redWin);
					}
				}
				else if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					frame.add(equality);
					
				}
				if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false) {
					frame.remove(case1);
					frame.remove(case2);
					frame.remove(case3);
					frame.remove(case4);
					frame.remove(case5);
					frame.remove(case6);
					frame.remove(case7);
					frame.remove(case8);
					frame.remove(case9);
					frame.remove(pannel);
					
					frame.invalidate();
					frame.validate();
				}
			}});
		
		case4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fill4 == true) {
					if(player == true) {
						case4.setBackground(Color.BLUE);
						
						player = false;
						fill4 = false;
						pos4 = 1;
					}
					else{
						case4.setBackground(Color.RED);
						
						player = true;
						fill4 = false;
						pos4 = 2;
					}
				}
				if(pos1 == pos2 && pos1 == pos3) {
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos4 && pos1 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos5 && pos1 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos2 == pos5 && pos2 == pos8){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos2 == 1){
						frame.add(blueWin);
					}
					else if(pos2 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos6 && pos3 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos5 && pos3 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos4 == pos5 && pos4 == pos6){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos4 == 1){
						frame.add(blueWin);
					}
					else if(pos4 == 2){
						frame.add(redWin);
					}
				}
				else if(pos7 == pos8 && pos7 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos7 == 1){
						frame.add(blueWin);
					}
					else if(pos7 == 2){
						frame.add(redWin);
					}
				}
				else if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					frame.add(equality);
					
				}
				if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false) {
					frame.remove(case1);
					frame.remove(case2);
					frame.remove(case3);
					frame.remove(case4);
					frame.remove(case5);
					frame.remove(case6);
					frame.remove(case7);
					frame.remove(case8);
					frame.remove(case9);
					frame.remove(pannel);
					
					frame.invalidate();
					frame.validate();
				}
			}});
		
		case5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fill5 == true) {
					if(player == true) {
						case5.setBackground(Color.BLUE);
						
						player = false;
						fill5 = false;
						pos5 = 1;
					}
					else{
						case5.setBackground(Color.RED);
						
						player = true;
						fill5 = false;
						pos5 = 2;
					}
				}
				if(pos1 == pos2 && pos1 == pos3) {
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos4 && pos1 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos5 && pos1 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos2 == pos5 && pos2 == pos8){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos2 == 1){
						frame.add(blueWin);
					}
					else if(pos2 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos6 && pos3 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos5 && pos3 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos4 == pos5 && pos4 == pos6){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos4 == 1){
						frame.add(blueWin);
					}
					else if(pos4 == 2){
						frame.add(redWin);
					}
				}
				else if(pos7 == pos8 && pos7 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos7 == 1){
						frame.add(blueWin);
					}
					else if(pos7 == 2){
						frame.add(redWin);
					}
				}
				else if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					frame.add(equality);
					
				}
				if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false) {
					frame.remove(case1);
					frame.remove(case2);
					frame.remove(case3);
					frame.remove(case4);
					frame.remove(case5);
					frame.remove(case6);
					frame.remove(case7);
					frame.remove(case8);
					frame.remove(case9);
					frame.remove(pannel);
					
					frame.invalidate();
					frame.validate();
				}
			}});
		
		case6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fill6 == true) {
					if(player == true) {
						case6.setBackground(Color.BLUE);
						
						player = false;
						fill6 = false;
						pos6 = 1;
					}
					else{
						case6.setBackground(Color.RED);
						
						player = true;
						fill6 = false;
						pos6 = 2;
					}
				}
				if(pos1 == pos2 && pos1 == pos3) {
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos4 && pos1 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos5 && pos1 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos2 == pos5 && pos2 == pos8){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos2 == 1){
						frame.add(blueWin);
					}
					else if(pos2 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos6 && pos3 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos5 && pos3 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos4 == pos5 && pos4 == pos6){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos4 == 1){
						frame.add(blueWin);
					}
					else if(pos4 == 2){
						frame.add(redWin);
					}
				}
				else if(pos7 == pos8 && pos7 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos7 == 1){
						frame.add(blueWin);
					}
					else if(pos7 == 2){
						frame.add(redWin);
					}
				}
				else if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					frame.add(equality);
					
				}
				if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false) {
					frame.remove(case1);
					frame.remove(case2);
					frame.remove(case3);
					frame.remove(case4);
					frame.remove(case5);
					frame.remove(case6);
					frame.remove(case7);
					frame.remove(case8);
					frame.remove(case9);
					frame.remove(pannel);
					
					frame.invalidate();
					frame.validate();
				}
			}});
		
		case7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fill7 == true) {
					if(player == true) {
						case7.setBackground(Color.BLUE);
						
						player = false;
						fill7 = false;
						pos7 = 1;
					}
					else{
						case7.setBackground(Color.RED);
						
						player = true;
						fill7 = false;
						pos7 = 2;
					}
				}
				if(pos1 == pos2 && pos1 == pos3) {
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos4 && pos1 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos5 && pos1 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos2 == pos5 && pos2 == pos8){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos2 == 1){
						frame.add(blueWin);
					}
					else if(pos2 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos6 && pos3 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos5 && pos3 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos4 == pos5 && pos4 == pos6){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos4 == 1){
						frame.add(blueWin);
					}
					else if(pos4 == 2){
						frame.add(redWin);
					}
				}
				else if(pos7 == pos8 && pos7 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos7 == 1){
						frame.add(blueWin);
					}
					else if(pos7 == 2){
						frame.add(redWin);
					}
				}
				else if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					frame.add(equality);
					
				}
				if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false) {
					frame.remove(case1);
					frame.remove(case2);
					frame.remove(case3);
					frame.remove(case4);
					frame.remove(case5);
					frame.remove(case6);
					frame.remove(case7);
					frame.remove(case8);
					frame.remove(case9);
					frame.remove(pannel);
					
					frame.invalidate();
					frame.validate();
				}
			}});
		
		case8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fill8 == true) {
					if(player == true) {
						case8.setBackground(Color.BLUE);
						
						player = false;
						fill8 = false;
						pos8 = 1;
					}
					else{
						case8.setBackground(Color.RED);
						
						player = true;
						fill8 = false;
						pos8 = 2;
					}
				}
				if(pos1 == pos2 && pos1 == pos3) {
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos4 && pos1 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos5 && pos1 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos2 == pos5 && pos2 == pos8){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos2 == 1){
						frame.add(blueWin);
					}
					else if(pos2 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos6 && pos3 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos5 && pos3 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos4 == pos5 && pos4 == pos6){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos4 == 1){
						frame.add(blueWin);
					}
					else if(pos4 == 2){
						frame.add(redWin);
					}
				}
				else if(pos7 == pos8 && pos7 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos7 == 1){
						frame.add(blueWin);
					}
					else if(pos7 == 2){
						frame.add(redWin);
					}
				}
				else if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					frame.add(equality);
					
				}
				if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false) {
					frame.remove(case1);
					frame.remove(case2);
					frame.remove(case3);
					frame.remove(case4);
					frame.remove(case5);
					frame.remove(case6);
					frame.remove(case7);
					frame.remove(case8);
					frame.remove(case9);
					frame.remove(pannel);
					
					frame.invalidate();
					frame.validate();
				}
			}});
		
		case9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(fill9 == true) {
					if(player == true) {
						case9.setBackground(Color.BLUE);
						
						player = false;
						fill9 = false;
						pos9 = 1;
					}
					else{
						case9.setBackground(Color.RED);
						
						player = true;
						fill9 = false;
						pos9 = 2;
					}
				}
				if(pos1 == pos2 && pos1 == pos3) {
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos4 && pos1 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos1 == pos5 && pos1 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos1 == 1){
						frame.add(blueWin);
					}
					else if(pos1 == 2){
						frame.add(redWin);
					}
				}
				else if(pos2 == pos5 && pos2 == pos8){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos2 == 1){
						frame.add(blueWin);
					}
					else if(pos2 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos6 && pos3 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos3 == pos5 && pos3 == pos7){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos3 == 1){
						frame.add(blueWin);
					}
					else if(pos3 == 2){
						frame.add(redWin);
					}
				}
				else if(pos4 == pos5 && pos4 == pos6){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos4 == 1){
						frame.add(blueWin);
					}
					else if(pos4 == 2){
						frame.add(redWin);
					}
				}
				else if(pos7 == pos8 && pos7 == pos9){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					if(pos7 == 1){
						frame.add(blueWin);
					}
					else if(pos7 == 2){
						frame.add(redWin);
					}
				}
				else if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false){
					
					fill1 = false;
					fill2 = false;
					fill3 = false;
					fill4 = false;
					fill5 = false;
					fill6 = false;
					fill7 = false;
					fill8 = false;
					fill9 = false;
					
					frame.add(equality);
					
				}
				if(fill1 == false && fill2 == false && fill3 == false && fill4 == false && fill5 == false && fill6 == false && fill7 == false && fill8 == false && fill9 == false) {
					frame.remove(case1);
					frame.remove(case2);
					frame.remove(case3);
					frame.remove(case4);
					frame.remove(case5);
					frame.remove(case6);
					frame.remove(case7);
					frame.remove(case8);
					frame.remove(case9);
					frame.remove(pannel);
					
					frame.invalidate();
					frame.validate();
				}
			}});
		
		winBlue.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player = true;
				
				fill1 = true;
				fill2 = true;
				fill3 = true;
				fill4 = true;
				fill5 = true;
				fill6 = true;
				fill7 = true;
				fill8 = true;
				fill9 = true;
				
				pos1 = 100;
				pos2 = 200;
				pos3 = 300;
				pos4 = 400;
				pos5 = 500;
				pos6 = 600;
				pos7 = 700;
				pos8 = 800;
				pos9 = 900;
				
				frame.remove(blueWin);
				
				frame.invalidate();
				frame.validate();
				
				case1.setBackground(Color.WHITE);
				case2.setBackground(Color.WHITE);
				case3.setBackground(Color.WHITE);
				case4.setBackground(Color.WHITE);
				case5.setBackground(Color.WHITE);
				case6.setBackground(Color.WHITE);
				case7.setBackground(Color.WHITE);
				case8.setBackground(Color.WHITE);
				case9.setBackground(Color.WHITE);
				
				frame.add(case1);
				frame.add(case2);
				frame.add(case3);
				frame.add(case4);
				frame.add(case5);
				frame.add(case6);
				frame.add(case7);
				frame.add(case8);
				frame.add(case9);
				
				frame.add(pannel);
		}});
		winRed.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player = true;
				
				fill1 = true;
				fill2 = true;
				fill3 = true;
				fill4 = true;
				fill5 = true;
				fill6 = true;
				fill7 = true;
				fill8 = true;
				fill9 = true;
				
				pos1 = 100;
				pos2 = 200;
				pos3 = 300;
				pos4 = 400;
				pos5 = 500;
				pos6 = 600;
				pos7 = 700;
				pos8 = 800;
				pos9 = 900;
				
				frame.remove(redWin);
				
				frame.invalidate();
				frame.validate();
				
				case1.setBackground(Color.WHITE);
				case2.setBackground(Color.WHITE);
				case3.setBackground(Color.WHITE);
				case4.setBackground(Color.WHITE);
				case5.setBackground(Color.WHITE);
				case6.setBackground(Color.WHITE);
				case7.setBackground(Color.WHITE);
				case8.setBackground(Color.WHITE);
				case9.setBackground(Color.WHITE);
				
				frame.add(case1);
				frame.add(case2);
				frame.add(case3);
				frame.add(case4);
				frame.add(case5);
				frame.add(case6);
				frame.add(case7);
				frame.add(case8);
				frame.add(case9);
				
				frame.add(pannel);
							
		}});
		winNobody.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player = true;
				
				fill1 = true;
				fill2 = true;
				fill3 = true;
				fill4 = true;
				fill5 = true;
				fill6 = true;
				fill7 = true;
				fill8 = true;
				fill9 = true;
				
				pos1 = 100;
				pos2 = 200;
				pos3 = 300;
				pos4 = 400;
				pos5 = 500;
				pos6 = 600;
				pos7 = 700;
				pos8 = 800;
				pos9 = 900;
				
				frame.remove(equality);
				
				frame.invalidate();
				frame.validate();
				
				case1.setBackground(Color.WHITE);
				case2.setBackground(Color.WHITE);
				case3.setBackground(Color.WHITE);
				case4.setBackground(Color.WHITE);
				case5.setBackground(Color.WHITE);
				case6.setBackground(Color.WHITE);
				case7.setBackground(Color.WHITE);
				case8.setBackground(Color.WHITE);
				case9.setBackground(Color.WHITE);
				
				frame.add(case1);
				frame.add(case2);
				frame.add(case3);
				frame.add(case4);
				frame.add(case5);
				frame.add(case6);
				frame.add(case7);
				frame.add(case8);
				frame.add(case9);
				
				frame.add(pannel);
							
		}});
		
		frame.add(pannel);
		frame.setSize(new Dimension(fcot + fcot/20, fcot + fcot/8));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}

}
