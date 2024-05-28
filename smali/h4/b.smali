.class public final Lh4/b;
.super Ls0/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh4/b$a;
    }
.end annotation


# static fields
.field public static final k:Lh4/b$a;


# instance fields
.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh4/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh4/b$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lh4/b;->k:Lh4/b$a;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh4/b;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh4/b;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh4/b;->h:Ljava/lang/String;

    return-object v0
.end method
