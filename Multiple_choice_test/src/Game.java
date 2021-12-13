import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Game {
	private ArrayList<Question> questionSet;
	public Game() {
		questionSet=new ArrayList<Question>();
		String q="\nWhere does the Sun rise?";
		String[]a={"east","west","north","south"};
		questionSet.add(new Question(q,a,"east"));
		
		q="\nWho invented telephone?";
		a=new String[] {"Edison","Faraday","Bell","Watt"};
		questionSet.add(new Question(q,a,"Bell"));
		
		q="\nCapital of Japan?";
		a=new String[] {"Beijing","Tokyo","Seoul","Bangkok"};
		questionSet.add(new Question(q,a,"Tokyo"));
		
		q="\nBrass gets discoloured in air because of the presence of which of the following gases in air?";
		a=new String[] {"Oxygen","Hydrogen sulphide","Carbon dioxide","Nitrogen"};
		questionSet.add(new Question(q,a,"Hydrogen sulphide"));
		
		q="\nWhich of the following is a non metal that remains liquid at room temperature?";
		a=new String[] {"Phosphorous","Bromine","Chlorine","Helium"};
		questionSet.add(new Question(q,a,"Bromine"));
		
		
		Collections.shuffle(questionSet,new Random());
		
	}
	
	public void start() {
		
		Scanner scan = new Scanner(System.in);
		int numCorrect=0;
		for(int question=0;question<questionSet.size();question++) {
			System.out.println(questionSet.get(question).getQuestion());
			int numChoices=questionSet.get(question).getChoices().size();
			for(int choice=0;choice<numChoices;choice++) {
				System.out.println((choice+1)+":"+ questionSet.get(question).getChoices().get(choice));
				
			}
			System.out.println("\nSelect Option: ");
			int playerAnswer=scan.nextInt();
			System.out.println("==================================== ");
			ArrayList<String>choiceSet=questionSet.get(question).getChoices();
			String correctAnswer=questionSet.get(question).getAnswer();
			int correctAnswerIndex=choiceSet.indexOf(correctAnswer);
			if(playerAnswer==correctAnswerIndex+1) {
				numCorrect++;
				
				}
			}
		scan.close();
		System.out.println("You got "+numCorrect +" correct answer(s)");
		
	}

}
