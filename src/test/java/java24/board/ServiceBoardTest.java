package java24.board;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java23.mybatis.infc.IServiceBook;
import java24.board.infc.IServiceBoard;
import java24.board.model.ModelBoard;

public class ServiceBoardTest {
    private static IServiceBoard service=null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
        	ApplicationContext context=
        			new ClassPathXmlApplicationContext("classpath:java24/board/ApplicationContext.xml");
            service = context.getBean("serviceboard",IServiceBoard.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Test
	public void testGetBoardName() {
		String name = null;
		try {
			name = service.getBoardName("data");
		} catch (Exception e) {
			fail("exception occured");
		}
		assertNotNull(name);
		assertEquals(name, "자료실");
	}

	@Test
	public void testGetBoardOne() {
		ModelBoard baord = null;
		try {
			baord = service.getBoardOne("data");
		} catch (Exception e) {
			fail("exception occured");
		}
		assertNotNull(baord);
		assertEquals(baord.getBoardnm(), "자료실");
	}

	@Test
	public void testGetBoardList() {
		List<ModelBoard> baord = null;
		try {
			baord = service.getBoardList();
		} catch (Exception e) {
			fail("exception occured");
		}
		assertNotNull(baord);
		assertNotEquals(baord.size(), 0);
	}

	@Test
	public void testGetBoardListResultMap() {
		List<ModelBoard> baord = null;
		try {
			baord = service.getBoardListResultMap();
		} catch (Exception e) {
			fail("exception occured");
		}
		assertNotNull(baord);
		assertNotEquals(baord.size(), 0);
	}

	@Test
	public void testInsertBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoardSearch() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoardPaging() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertBoardList() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetArticleTotalRecord() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetArticleList() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void testIncreaseHit() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNextArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrevArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAttachFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAttachFileList() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertAttachFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAttachFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComment() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCommentList() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertComment() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateComment() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteComment() {
		fail("Not yet implemented");
	}

}
