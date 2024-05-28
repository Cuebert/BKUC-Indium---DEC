.class public final Lw0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lw0/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls0/b;Landroid/content/Context;)Landroid/os/Bundle;
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Ls0/b;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Ls0/b;->c()Ls0/b$b;

    move-result-object v1

    invoke-virtual {v1}, Ls0/b$b;->a()Landroid/os/Bundle;

    move-result-object v1

    .line 3
    instance-of v2, p1, Ls0/e;

    if-eqz v2, :cond_0

    sget p1, Ls0/b0;->c:I

    goto :goto_0

    .line 4
    :cond_0
    instance-of p1, p1, Ls0/g;

    if-eqz p1, :cond_1

    sget p1, Ls0/b0;->b:I

    goto :goto_0

    .line 5
    :cond_1
    sget p1, Ls0/b0;->a:I

    .line 6
    :goto_0
    invoke-static {p2, p1}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object p1

    const-string p2, "androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON"

    .line 7
    invoke-virtual {v1, p2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO"

    .line 8
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method
