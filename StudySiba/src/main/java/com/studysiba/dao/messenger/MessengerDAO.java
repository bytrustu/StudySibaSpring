package com.studysiba.dao.messenger;

import java.util.List;

import com.studysiba.domain.messenger.MessageVO;

public interface MessengerDAO {
	// 메세지 roomId 확인
	String checkRoomId(MessageVO messageVO);
	// 새로운 메세지 일 경우
	int newMessage(MessageVO messageVO);
	// 기존 대화가 있는 메세지 일 경우
	int sendMessage(MessageVO messageVO);
	// 신규 roomId 발급
	long getRoomId();
	// 메세지 뷰
	List<MessageVO> getMessage(MessageVO messageVO);

}