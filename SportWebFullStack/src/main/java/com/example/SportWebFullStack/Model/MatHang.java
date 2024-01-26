package com.example.SportWebFullStack.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatHang {


	private int id;
	
	
	private String mamathang;
	
	

	private String tenmathang;
	
	
	private String maphanloai;
	
	private String hinhanh;
	
	private Long  dongia;
	

	private String  danhgia;
	
	
	private String  soluong;
	
	private String  mota;
}