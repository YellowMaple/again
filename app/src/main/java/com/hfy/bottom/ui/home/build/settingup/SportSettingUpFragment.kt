package com.hfy.bottom.ui.home.build.settingup

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.hfy.bottom.R
import com.hfy.bottom.databinding.FragmentSportSettingUpBinding
import com.hfy.bottom.extentions.longToast
import com.hfy.bottom.extentions.toast
import com.hfy.bottom.ui.home.build.settingup.adapter.GridImageAdapter
import com.luck.picture.lib.PictureSelector
import com.luck.picture.lib.config.PictureConfig
import com.luck.picture.lib.config.PictureMimeType
import com.luck.picture.lib.entity.LocalMedia


class SportSettingUpFragment : Fragment() {
    private val args: SportSettingUpFragmentArgs by navArgs()
    private lateinit var viewModel: SportSettingUpViewModel
    private lateinit var binding:FragmentSportSettingUpBinding
    private  lateinit var selectList : List<LocalMedia>
    private lateinit var adapter:GridImageAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =SportSettingUpViewModel(args.sportId)
        binding= FragmentSportSettingUpBinding.inflate(inflater, container, false)
        val manager = FullyGridLayoutManager(activity, 4, GridLayoutManager.VERTICAL, false)
        adapter = GridImageAdapter(context,onAddPicClickListener)
        adapter.setOnItemClickListener{ position, _ ->
            val media = selectList[position]
            val mimeType = media.mimeType
            when(PictureMimeType.getMimeType(mimeType)){
                PictureConfig.TYPE_VIDEO->// 预览视频
                    PictureSelector.create(this).externalPictureVideo(media.path)
                PictureConfig.TYPE_AUDIO->
                    // 预览音频
                    PictureSelector.create(this).externalPictureAudio(media.path)
                else ->
                    PictureSelector.create(this)
                        .themeStyle(R.style.picture_default_style)
                        .openExternalPreview(position, selectList)

            }
        }
        binding.recycler.layoutManager=manager
        binding.recycler.adapter=adapter
        binding.fabAddGalleryPhoto.setOnClickListener{
            PictureSelector.create(this)
                .openGallery(PictureMimeType.ofImage())
                .forResult(PictureConfig.CHOOSE_REQUEST)
        }


        return binding.root
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            context?.longToast("get back")
            when (requestCode) {
                PictureConfig.CHOOSE_REQUEST -> {
                    context?.longToast("get into")
                    selectList  = PictureSelector.obtainMultipleResult(data)
                    // 例如 LocalMedia 里面返回四种path
                    // 1.media.getPath(); 为原图path
                    // 2.media.getCutPath();为裁剪后path，需判断media.isCut();是否为true  注意：音视频除外
                    // 3.media.getCompressPath();为压缩后path，需判断media.isCompressed();是否为true  注意：音视频除外
                    // 如果裁剪并压缩了，以取压缩路径为准，因为是先裁剪后压缩的
                    // 4.media.getAndroidQToPath();为Android Q版本特有返回的字段，此字段有值就用来做上传使用
                    adapter.setList(selectList)
                    adapter.notifyDataSetChanged()
                }


            }
        } else {
            context?.toast("Task Cancelled")
        }
    }

    private val onAddPicClickListener = GridImageAdapter.onAddPicClickListener {
        // 进入相册 以下是例子：不需要的api可以不写
        PictureSelector.create(this)
            .openGallery(PictureMimeType.ofAll())
            .theme(R.style.picture_default_style)
            .maxSelectNum(9)
            .minSelectNum(1)
            .selectionMode(PictureConfig.MULTIPLE )
            .previewImage(true)
            .previewVideo(true)
            .enablePreviewAudio(true) // 是否可播放音频
            .isCamera(true)
            .enableCrop(true)
            .compress(true)
            .glideOverride(160, 160)
            .previewEggs(true)
            .freeStyleCropEnabled(true)
            .circleDimmedLayer(true)
            .showCropFrame(true)
            .showCropGrid(true)
            .openClickSound(true)
            .selectionMedia(selectList)
            .forResult(PictureConfig.CHOOSE_REQUEST)
    }
}