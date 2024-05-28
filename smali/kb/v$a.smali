.class public final Lkb/v$a;
.super Lva/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lva/b<",
        "Lva/d;",
        "Lkb/v;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lva/d;->l:Lva/d$b;

    .line 2
    sget-object v1, Lkb/v$a$a;->n:Lkb/v$a$a;

    .line 3
    invoke-direct {p0, v0, v1}, Lva/b;-><init>(Lva/e$b;Ldb/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lkb/v$a;-><init>()V

    return-void
.end method
