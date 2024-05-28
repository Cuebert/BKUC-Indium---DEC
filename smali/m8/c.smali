.class public final synthetic Lm8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/g;


# instance fields
.field public final synthetic a:Lcom/roblox/client/qrscanner/CustomCaptureActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/qrscanner/CustomCaptureActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm8/c;->a:Lcom/roblox/client/qrscanner/CustomCaptureActivity;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lm8/c;->a:Lcom/roblox/client/qrscanner/CustomCaptureActivity;

    invoke-static {v0, p1}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->B1(Lcom/roblox/client/qrscanner/CustomCaptureActivity;Ljava/lang/Exception;)V

    return-void
.end method
