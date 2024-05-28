.class public abstract Ls0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/i$a;
    }
.end annotation


# static fields
.field public static final c:Ls0/i$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls0/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls0/i$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Ls0/i;->c:Ls0/i$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls0/i;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ls0/i;->b:Landroid/os/Bundle;

    return-void
.end method
