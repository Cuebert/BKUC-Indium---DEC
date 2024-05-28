.class public final Ls0/a0;
.super Ls0/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/a0$a;
    }
.end annotation


# static fields
.field public static final e:Ls0/a0$a;


# instance fields
.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls0/a0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls0/a0$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Ls0/a0;->e:Ls0/a0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "authenticationResponseJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Ls0/a0;->e:Ls0/a0$a;

    invoke-virtual {v0, p1}, Ls0/a0$a;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ls0/a0;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"

    .line 1
    invoke-direct {p0, v0, p2}, Ls0/i;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 2
    iput-object p1, p0, Ls0/a0;->d:Ljava/lang/String;

    .line 3
    sget-object p2, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {p2, p1}, Lw0/c$a;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "authenticationResponseJson must not be empty, and must be a valid JSON"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/os/Bundle;Lkotlin/jvm/internal/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls0/a0;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/a0;->d:Ljava/lang/String;

    return-object v0
.end method
