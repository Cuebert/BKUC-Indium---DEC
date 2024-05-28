.class public abstract Lua/b;
.super Lua/a;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lua/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lua/a<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static final n:Lua/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lua/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lua/b$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lua/b;->n:Lua/b$a;

    return-void
.end method
