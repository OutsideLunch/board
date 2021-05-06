package board.dto;

import lombok.Data;

@Data
public class BoardFileDto {
	private int idx;
	private int boardIdx;
	private String originalFilename;
	private String storedFilePath;
	private long fileSize;
	
}
