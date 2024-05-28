.class public abstract Ls0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/b$a;,
        Ls0/b$b;
    }
.end annotation


# static fields
.field public static final i:Ls0/b$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/os/Bundle;

.field private final c:Landroid/os/Bundle;

.field private final d:Z

.field private final e:Z

.field private final f:Ls0/b$b;

.field private final g:Ljava/lang/String;

.field private final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls0/b$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Ls0/b;->i:Ls0/b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLs0/b$b;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "credentialData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "candidateQueryData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayInfo"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls0/b;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ls0/b;->b:Landroid/os/Bundle;

    .line 4
    iput-object p3, p0, Ls0/b;->c:Landroid/os/Bundle;

    .line 5
    iput-boolean p4, p0, Ls0/b;->d:Z

    .line 6
    iput-boolean p5, p0, Ls0/b;->e:Z

    .line 7
    iput-object p6, p0, Ls0/b;->f:Ls0/b$b;

    .line 8
    iput-object p7, p0, Ls0/b;->g:Ljava/lang/String;

    .line 9
    iput-boolean p8, p0, Ls0/b;->h:Z

    const-string p1, "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED"

    .line 10
    invoke-virtual {p2, p1, p5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"

    .line 11
    invoke-virtual {p2, p4, p8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 12
    invoke-virtual {p3, p1, p5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Ls0/b;->c:Landroid/os/Bundle;

    return-object v0
.end method

.method public final b()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Ls0/b;->b:Landroid/os/Bundle;

    return-object v0
.end method

.method public final c()Ls0/b$b;
    .locals 1

    iget-object v0, p0, Ls0/b;->f:Ls0/b$b;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/b;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Ls0/b;->d:Z

    return v0
.end method
