.class Lcom/roblox/client/captcha/SignUpCaptchaConfig$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/captcha/SignUpCaptchaConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/roblox/client/captcha/SignUpCaptchaConfig;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/roblox/client/captcha/SignUpCaptchaConfig;
    .locals 0

    new-instance p1, Lcom/roblox/client/captcha/SignUpCaptchaConfig;

    invoke-direct {p1}, Lcom/roblox/client/captcha/SignUpCaptchaConfig;-><init>()V

    return-object p1
.end method

.method public b(I)[Lcom/roblox/client/captcha/SignUpCaptchaConfig;
    .locals 0

    new-array p1, p1, [Lcom/roblox/client/captcha/SignUpCaptchaConfig;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/captcha/SignUpCaptchaConfig$a;->a(Landroid/os/Parcel;)Lcom/roblox/client/captcha/SignUpCaptchaConfig;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/captcha/SignUpCaptchaConfig$a;->b(I)[Lcom/roblox/client/captcha/SignUpCaptchaConfig;

    move-result-object p1

    return-object p1
.end method
