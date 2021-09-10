//package com.bit.growith.vo;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//public class Files {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long fileId;
//
//    @Column
//    private Long recruitBoardId;
//
//    @Column
//    private String serverFileName;
//
//    @Column
//    private String localFileName;
//
//    @Column
//    private String fileUrl;
//
//    @ManyToOne
//    @JoinColumn(name = "recruitBoardId")
//    private RecruitBoards recruitBoards;
//
//
//}
