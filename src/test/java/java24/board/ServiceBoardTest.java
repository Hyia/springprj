package java24.board;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
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
        String board = "data";
        String result = null;
        try {
            result = service.getBoardName(board);
        } catch (Exception e) {
        }
        assertEquals(result,"자료실");
    }
    
    @Test
    public void testGetBoardOne() {
        ModelBoard result = null;
        ModelBoard board = new ModelBoard();
        board.setBoardnm("자료실");
        board.setBoardcd("data");
        board.setUseYN(true);
        try {
            result = service.getBoardOne("data");
        } catch (Exception e) {
        }
        assertEquals(result,board);
        
    }
    
    @Test
    public void testGetBoardList() {
        List<ModelBoard> result = new ArrayList<ModelBoard>();
        try {
            result = service.getBoardList();
        } catch (Exception e) {
        }
        assertSame(result.size(),3);
    }
    
    @Test
    public void testGetBoardListResultMap() {
        List<ModelBoard> result = new ArrayList<ModelBoard>();
        try {
            result = service.getBoardListResultMap();
        } catch (Exception e) {
        }
        
        assertNotEquals(result.size(),0);
    }
    
    @Test
    public void testInsertBoard() {
        ModelBoard board = new ModelBoard();
        board.setBoardnm("test");
        board.setBoardcd("test");
        board.setUseYN(true);
        int result = -1;
        try {
            result = service.insertBoard(board);
        } catch (Exception e) {
        }
        assertSame(result, 1);
        try {
            service.deleteBoard(board);
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testUpdateBoard() {
        ModelBoard board = new ModelBoard();
        board.setBoardnm("test");
        board.setBoardcd("test");
        board.setUseYN(true);
        ModelBoard nboard = new ModelBoard();
        nboard.setBoardnm("update");
        nboard.setBoardcd("update");
        nboard.setUseYN(false);
        int result = -1;
        try {
            service.insertBoard(board);
            result = service.updateBoard(board, nboard);
        } catch (Exception e) {
        }
        assertSame(result, 1);
        try {
            service.deleteBoard(board);
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testDeleteBoard() {
        ModelBoard board = new ModelBoard();
        board.setBoardnm("test");
        board.setBoardcd("test");
        board.setUseYN(true);
        int result = -1;
        try {
            service.insertBoard(board);
        } catch (Exception e) {
        }
        try {
            result = service.deleteBoard(board);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testGetBoardSearch() {
        List<ModelBoard> result = null;
        ModelBoard board = new ModelBoard();
        board.setBoardnm("자료실");
        try {
            result = service.getBoardSearch(board);
        } catch (Exception e) {
        }
        
    }
    
    @Test
    public void testGetBoardPaging() {
        List<ModelBoard> result = null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("searchWord","자료실");
        map.put("boardcd","data");
        map.put("start",0);
        map.put("end",99);
        try {
            result = service.getBoardPaging(map);
        } catch (Exception e) {
       
   
        }
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testInsertBoardList() {
        List<ModelBoard> boardlist = new ArrayList<ModelBoard>();
        ModelBoard board = new ModelBoard();
        board.setBoardnm("test1");
        board.setBoardcd("test1");
        board.setUseYN(true);
        ModelBoard board1 = new ModelBoard();
        board1.setBoardnm("test2");
        board1.setBoardcd("test2");
        board1.setUseYN(true);
        
        boardlist.add(board);
        boardlist.add(board1);

        int result = -1;
        try {
            result = service.insertBoardList(boardlist);
        } catch (Exception e) {
        }
        assertSame(result, 2);
    }
    
    @Test
    public void testGetArticleTotalRecord() {
        int result = -1;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("searchWord","자료실");
        map.put("boardcd","data");
        map.put("start",0);
        map.put("end",99);
        try {
            result = service.getArticleTotalRecord(map);
        } catch (Exception e) {}
        
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
