package board.bean;

import lombok.Data;

@Data
public class BoardPaging {
	private int currentPage;
	private int pageBlock;
	private int pageSize;
	private int totalA;
	private StringBuffer pagingHTML;

	public void makingPagingHTML() {
		pagingHTML = new StringBuffer();

		int totalP = (totalA + (pageSize-1))/pageSize;// 총페이지수

		int startPage = (currentPage-1)/pageBlock *pageBlock+1;
		int endPage = startPage + pageBlock - 1;

		if (endPage > totalP) {
			endPage = totalP;
		}

		if (startPage > pageBlock) {
			pagingHTML.append("<span id='paging' onclick='boardPaging("+(startPage-1)+")'>[이전]</span>");
		}
		/*
		 * if (startPage>pageBlock) {
		 * pagingHTML.append("<span id='paging'>[이전]</span>"); }
		 */

		for (int i = startPage; i <= endPage; i++) {
			if (i == currentPage) {
				pagingHTML.append("<a href='boardList.jsp?pg=" + i + "'><span id='currentPaging'>" + i + "</span></a>");
			}
			else {
				pagingHTML.append("<a href='boardList.jsp?pg=" + i + "'><span id='paging'>" + i + "</span></a>");
			}
		}

		if (endPage != totalP) {
			pagingHTML.append("<span id='paging' onclick='boardPaging("+(endPage+1)+")'>[다음]</span>");
		}

	}
}
