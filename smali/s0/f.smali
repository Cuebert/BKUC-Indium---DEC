.class public final Ls0/f;
.super Ls0/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/f$a;
    }
.end annotation


# static fields
.field public static final d:Ls0/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls0/f$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Ls0/f;->d:Ls0/f$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p0, v0}, Ls0/f;-><init>(Landroid/os/Bundle;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "android.credentials.TYPE_PASSWORD_CREDENTIAL"

    .line 1
    invoke-direct {p0, v0, p1}, Ls0/c;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Bundle;Lkotlin/jvm/internal/e;)V
    .locals 0

    invoke-direct {p0, p1}, Ls0/f;-><init>(Landroid/os/Bundle;)V

    return-void
.end method
