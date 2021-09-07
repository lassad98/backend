package net.javaguides.springboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;




@Entity
@Table(name="mission")
public class Mission {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id ;
		@Column(name="end_date")
		private String endDate;
		@Column(name="mission_name")
		private String nameMission ; 
		@Column(name="start_date")
		private String startDate  ;
		@ManyToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "missions")      
		private Set<Employee> employees = new HashSet<>();
		
		public Mission(String nameMission, String startDate, String endDate) {
			super();
			this.nameMission = nameMission;
			this.startDate = startDate;
			this.endDate = endDate;
		}

		public Mission() {
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNameMission() {
			return nameMission;
		}

		public void setNameMission(String nameMission) {
			this.nameMission = nameMission;
		}

		public String getStartDate() {
			return startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		@Override
		public String toString() {
			return "Mission [id=" + id + ", nameMission=" + nameMission + ", startDate=" + startDate + ", endDate="
					+ endDate + "]";
		}
		
		
	
}
