package com.precious.whatsappclone1.interfaces;

import com.precious.whatsappclone1.model.chat.Chats;

import java.util.List;

public interface OnReadChatCallBack {
    void onReadSuccess(List<Chats> list);
    void onReadFailed();
}
