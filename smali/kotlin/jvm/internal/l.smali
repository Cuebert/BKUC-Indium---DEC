.class public abstract Lkotlin/jvm/internal/l;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Lhb/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/n;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lhb/b;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/p;->d(Lkotlin/jvm/internal/l;)Lhb/f;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lhb/f;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
