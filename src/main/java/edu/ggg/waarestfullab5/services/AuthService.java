package edu.ggg.waarestfullab5.services;

import edu.ggg.waarestfullab5.domain.dto.request.LoginRequest;
import edu.ggg.waarestfullab5.domain.dto.request.RefreshTokenRequest;
import edu.ggg.waarestfullab5.domain.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
