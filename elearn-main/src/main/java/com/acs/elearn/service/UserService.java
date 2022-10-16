package com.acs.elearn.service;

import com.acs.elearn.dao.model.Commodity;
import com.acs.elearn.dao.model.User;

import java.util.List;


public interface UserService {

    User getUserInfo(String userId);
    List<Commodity> getUserPurchasedCommodity(String userId);

    List<Commodity> getMerchantCommodity(String userId);

    User updateUserInfo(User user) throws Exception;

    User addUserInfo(User user) throws Exception;

    String deleteUser(String userId) throws Exception;
}
