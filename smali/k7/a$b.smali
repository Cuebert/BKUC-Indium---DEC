.class Lk7/a$b;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/webkit/WebViewClient;

.field final synthetic b:Lk7/a;


# direct methods
.method constructor <init>(Lk7/a;Landroid/webkit/WebViewClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk7/a$b;->b:Lk7/a;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 2
    iput-object p2, p0, Lk7/a$b;->a:Landroid/webkit/WebViewClient;

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/a$b;->b:Lk7/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lk7/a;->i(Lk7/a;Z)Z

    .line 2
    iget-object v0, p0, Lk7/a$b;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lk7/a$b;->b:Lk7/a;

    invoke-static {p1}, Lk7/a;->j(Lk7/a;)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/a$b;->b:Lk7/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lk7/a;->i(Lk7/a;Z)Z

    .line 2
    iget-object v0, p0, Lk7/a$b;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method
