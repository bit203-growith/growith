package com.bit.growith.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Comunity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comunityId;
	
	@Column(nullable = false, length = 100)
	private String title;
	
	@Lob
	private String content;
	
	private int count;
	
	@ManyToOne
	@JoinColumn(name = "memberId")
    private Member member;
	
	@ManyToOne
	@JoinColumn(name = "teamsId")
    private Teams teams;
	
	@CreationTimestamp
	private Timestamp createDate;
}
