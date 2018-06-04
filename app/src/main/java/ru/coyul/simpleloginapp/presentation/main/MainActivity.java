package ru.coyul.simpleloginapp.presentation.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.coyul.simpleloginapp.R;
import ru.coyul.simpleloginapp.presentation.base.BaseActivity;
import ru.coyul.simpleloginapp.presentation.login.LoginActivity;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter mMainPresenter;

    @BindView(R.id.button_login)
    Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        activityComponent().inject(this);
        mMainPresenter.attachView(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMainPresenter.onLoginButtonClick();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainPresenter.detachView();
    }

    @Override
    public void openLoginActivity() {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
