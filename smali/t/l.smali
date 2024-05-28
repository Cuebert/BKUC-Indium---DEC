.class public Lt/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lw/y1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw/y1;

    invoke-static {}, Lt/m;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lw/y1;-><init>(Ljava/util/List;)V

    sput-object v0, Lt/l;->a:Lw/y1;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lw/x1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lw/x1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Lt/l;->a:Lw/y1;

    invoke-virtual {v0, p0}, Lw/y1;->b(Ljava/lang/Class;)Lw/x1;

    move-result-object p0

    return-object p0
.end method

.method public static b()Lw/y1;
    .locals 1

    sget-object v0, Lt/l;->a:Lw/y1;

    return-object v0
.end method
