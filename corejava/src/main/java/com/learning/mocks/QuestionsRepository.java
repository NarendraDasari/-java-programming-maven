package com.learning.mocks;

import java.util.HashMap;

import com.learning.chaitanya.models.Item;

public class QuestionsRepository {
	
	HashMap<Integer,String> questions;
	
	
	public QuestionsRepository() {
		this.questions = new HashMap<Integer,String>();
		setQuestions();
	}
	
	
	
	public Item[] getQuestionList() {
		
		Item[] questionItems = new Item[questions.size()];
		int index =0;
		for(Integer i: questions.keySet()) {
			questionItems[index] = new Item(i, questions.get(i));
			index++;
		}
		
		return questionItems;
	}
	
	
	
	private void setQuestions() {
		this.questions.put(1, "If you approach a vehicle with a triangular reflective orange sign on its rear, what should you do?");
		this.questions.put(2, "When you're driving in fog at night, you should use your _________ lights.");
		this.questions.put(3, "In which of the following places are you NOT allowed to park your vehicle?");
		this.questions.put(4, "You must use your headlights _________ and whenever visibility is limited.");
		this.questions.put(5, "If you miss your exit on an expressway, what should you do?");
		this.questions.put(6, "On a multilane road, if you see _________ next to your lane, you may pass when it is safe to do so.");
		this.questions.put(7, "In Oklahoma, you must dim your headlights whenever you are within ________ of an oncoming vehicle.");
		this.questions.put(8, "Do not use the opposing lane to pass another vehicle unless you have at least _______ of clear roadway ahead of you.");
		this.questions.put(9, "Under Oklahoma law, which occupants of a vehicle must wear seat belts or suitable child restraints?");
		this.questions.put(10, "Don't try to pass another vehicle if you are within _______ of an obstructed view.");
		this.questions.put(11, "Under Oklahoma law, the maximum speed limit on four-lane divided highways and two-lane superhighways is _______ unless otherwise posted.");
		this.questions.put(12, "The proper hand position on the steering wheel for a solid and strong grip is");
		this.questions.put(13, "At a railroad crossing, you must stop _________ from the nearest rail if a train is approaching.");
		this.questions.put(14, "To enter an expressway, enter it in _________ and adjust your speed before changing lanes.");
		this.questions.put(15, "If you are driving slower than the other traffic on an expressway, you should use");
		this.questions.put(16, "If another driver is following you too closely (tailgating you), you must");
		this.questions.put(17, "If an emergency vehicle is approaching you with a siren and flashing lights on, you must");
		this.questions.put(18, "In city driving, you should start to signal for at least _________ before you turn, slow down, or stop.");
		this.questions.put(19, "In heavy rain, your tires can ride on a film of water and lose contact with the road. This hazard is known as");
		this.questions.put(20, "For an adequate cushion of safety in front of your vehicle, use");
		this.questions.put(21, "For a driver who is at least 21 years of age, the legal limit for blood alcohol content (BAC) is");
		this.questions.put(22, "When you brake a vehicle without antilock brakes on ice, snow, sleet, gravel, sand, and other loose surfaces, you should tap your brakes slightly at _________ intervals to avoid a skid.");
		this.questions.put(23, "You are driving on an undivided roadway. If you approach a school bus with flashing red lights or showing a red STOP sign, you must");
		this.questions.put(24, "What kind of parking is commonly found in parking lots and shopping centers and sometimes at curbs?");
		this.questions.put(25, "The stopping distance of your vehicle depends on which of the following factors?");
		this.questions.put(26, "When you are turning from a one-way street onto a two-way street or divided roadway, you should turn from");
		this.questions.put(27, "If a truck is trying to pass you, you can help the truck driver by");
		this.questions.put(28, "On Oklahoma's expressways, the minimum speed limit is usually");
		this.questions.put(29, "Upon approaching an intersection, you see a pedestrian with a white cane crossing the street. What should you do?");
		this.questions.put(31, "When two vehicles arrive at an intersection without traffic signs or signals at about the same time, which one has the right-of-way?");
		this.questions.put(32, "If while at an intersection, your view of traffic is blocked, you should ______.");
		this.questions.put(33, "When must you yield for children?");
		this.questions.put(34, "How long should you use your signal before making a turn?");
		
	}
}
