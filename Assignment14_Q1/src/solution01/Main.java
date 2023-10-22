package solution01;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add new Candidate.");
			System.out.println("2. Update Existing Candidate.");
			System.out.println("3. Get Party Wise Votes.");
			System.out.println("4. Display all Candidates.");
			System.out.println("Enter your Choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				try (CandidateDao dao = new CandidateDao()) {
					Candidate c1 = new Candidate(0, "shikhar", "bjp", 2);
					int cnt = dao.saveCandidate(c1);
					System.out.println("Candidates added " + cnt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;

			case 2:
				try (CandidateDao dao = new CandidateDao()) {
					Candidate c2 = new Candidate(1, "", "", 0);
					int cnt = dao.updateCandidate(c2);
					System.out.println("Candidates updates " + cnt);
				} catch (SQLException e) {
					e.printStackTrace();
				}

			case 3:
				try (CandidateDao dao = new CandidateDao()) {
					List<PartyVotes> list = dao.getPartyWiseVotes();
					list.forEach(pv -> System.out.println(pv));
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			case 4:
				try(CandidateDao cd=new CandidateDao())
				{
					List<Candidate> list=cd.getAll();
					list.forEach(c->System.out.println(c));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;

			default:
				break;
			}
		} while (choice != 0);

	}

}
