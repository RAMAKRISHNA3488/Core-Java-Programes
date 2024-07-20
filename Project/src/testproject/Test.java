package testproject;

import eventmanagement.Organaizar;
import eventmanagement.Vence;
import eventmanagement.Event;
import eventmanagement.Participant;
public class Test {

	public static void main(String[] args) {
		
	Organaizar organaizer=new Organaizar();
     organaizer.id=123l;
     organaizer.name="VIP";
     System.out.println(organaizer);
     System.out.println("Organaizar is: "+organaizer.name);
     
     Event event=new Event();
     event.id=543l;
     event.name="tournament";
     event.description="Events";
     event.starttime="11AM";
     event.endtime="8PM";
     event.started=true;
     System.out.println(event);
     System.out.println(event.name);
     System.out.println(event.description);
     System.out.println(event.starttime);
     System.out.println(event.endtime);
     System.out.println(event.started);
     
     
     Vence vence=new Vence();
     vence.id=7685l;
     vence.name1="cricket";
     vence.name2="football";
     vence.name3="running";
     vence.name4="hockey";
     vence.name5="basketball";
     vence.description="All are available";
     vence.StreetAddrees="Ramchandhra mission";
     vence.city="Kurnool";
     vence.state="Andhra Pradesh";
     vence.country="India";
     vence.pincode=518002l;
     System.out.println(vence);
     System.out.println(vence.id);
     System.out.println(vence.name1);
     System.out.println(vence.name2);
     System.out.println(vence.name3);
     System.out.println(vence.name4);
     System.out.println(vence.name5);
     System.out.println(vence.description);
     System.out.println(vence.StreetAddrees);
     System.out.println(vence.city);
     System.out.println(vence.state);
     System.out.println(vence.country);
     System.out.println(vence.pincode);
     
     
     Participant participant=new Participant();
     participant.id=111l;
     participant.name="Ram";
     participant.email="ramak3488@gmail.com";
     participant.checkedin=true;
     participant.id1=143l;
     participant.name1="prajval";
     participant.email1="prajval143@gmail.com";
     participant.checkedin1=true;
     System.out.println(participant);
     System.out.println(participant.id);
     System.out.println(participant.name);
     System.out.println(participant.email);
     System.out.println(participant.checkedin);
     System.out.println(participant);
     System.out.println(participant.id1);
     System.out.println(participant.name1);
     System.out.println(participant.email1);
     System.out.println(participant.checkedin1);
     
     
	}

}
