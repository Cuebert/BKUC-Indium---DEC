.class public final Lk2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk2/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Lk2/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lk2/d;
    .locals 1

    invoke-static {}, Lk2/d$a;->a()Lk2/d;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lk2/a;
    .locals 2

    invoke-static {}, Lk2/b;->b()Lk2/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lc2/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk2/a;

    return-object v0
.end method


# virtual methods
.method public b()Lk2/a;
    .locals 1

    invoke-static {}, Lk2/d;->c()Lk2/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk2/d;->b()Lk2/a;

    move-result-object v0

    return-object v0
.end method
