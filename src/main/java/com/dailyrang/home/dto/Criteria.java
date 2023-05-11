package com.dailyrang.home.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Criteria {
	
	private int pageNum=1;//현재 페이지 번호(글 리스트 화면에서 무조건 1페이지가 보여져야 하므로 초기값은 1)

	public double getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
