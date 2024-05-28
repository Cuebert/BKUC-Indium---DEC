.class public abstract Lkb/o0;
.super Lkb/v;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/o0$a;
    }
.end annotation


# static fields
.field public static final p:Lkb/o0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb/o0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/o0$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lkb/o0;->p:Lkb/o0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkb/v;-><init>()V

    return-void
.end method
