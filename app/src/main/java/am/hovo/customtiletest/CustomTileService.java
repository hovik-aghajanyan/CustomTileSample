package am.hovo.customtiletest;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.service.quicksettings.TileService;

//onTileAdded()	Called when user adds the tile to the quick settings from the edit interface
//onTileRemoved()	Called when the tile is removed from the quick settings using the edit interface.
//onStartListening()	Called when the tile is brought into the listening state.
//onStopListening()	Called when the tile is brought out of the listening state.
//onClick()	Called when the tile is clicked.

@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.N)
public class CustomTileService extends TileService {
    public CustomTileService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onTileAdded() {
        super.onTileAdded();
    }

    @Override
    public void onTileRemoved() {
        super.onTileRemoved();
    }

    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
    }

    @Override
    public void onClick() {
        super.onClick();
        //Start main activity
        startActivity(new Intent(this, MainActivity.class));
    }
}
