package com.cafe24.dk4750.miniMarket.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.dk4750.miniMarket.vo.CompanyItemLike;
import com.cafe24.dk4750.miniMarket.vo.MemberItemLike;

@Mapper
public interface CompanyItemLikeMapper {
	
	//업체 글 생성시 좋아요 최소
	public int insertLike(int companyItemNo);
	// 업체 글 좋아요 수
	public int selectItemLike(CompanyItemLike companyItemLike);
	
	// 내가 이 업체 아이템을 좋아요 했는지 확인하기 
	public Integer CheckCompanyItemLike(CompanyItemLike companyItemLike);
	
	// 내 like active 가져오기
	public Integer CheckCompanyItemLike2(CompanyItemLike companyItemLike);
	
	// 멤버가 처음으로 업체관심등록 할 때 인서트
	public int insertLikeCompanyItem(CompanyItemLike companyItemLike);
	
	// 업체 관심등록 active 업데이트
	public int updateCompanyItemLikeChange(CompanyItemLike companyItemLike);
	
}
