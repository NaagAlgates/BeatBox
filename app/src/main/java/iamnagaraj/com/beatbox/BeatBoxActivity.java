package iamnagaraj.com.beatbox;

import android.support.v4.app.Fragment;

import iamnagaraj.com.beatbox.fragments.BeatBoxFragment;

public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}