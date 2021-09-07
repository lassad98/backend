package net.javaguides.springboot.model;
import javax.persistence.Column; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="causes")
public class Causes {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id ; 
		@Column(name="causes")
		private String causes; 
		@Column(name="jour_raté")
		private String joursRatés ;
		
		public Causes() {
			super();
	
		}

		public Causes(String causes, String joursRatés) {
			super();
			this.causes = causes;
			this.joursRatés = joursRatés;
		}

		public String getCauses() {
			return causes;
		}

		public void setCauses(String causes) {
			this.causes = causes;
		}

		public String getJoursRatés() {
			return joursRatés;
		}


		public void setJoursRatés(String joursRatés) {
			this.joursRatés = joursRatés;
		}

		@Override
		public String toString() {
			return "Causes [id=" + id + ", causes=" + causes + ", joursRatés=" + joursRatés + "]";
		}  

		
}
