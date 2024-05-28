.class public final synthetic Ly3/k7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/b;


# instance fields
.field public final synthetic a:Ly1/g;


# direct methods
.method public synthetic constructor <init>(Ly1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/k7;->a:Ly1/g;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ly3/k7;->a:Ly1/g;

    const-class v1, [B

    const-string v2, "json"

    .line 1
    invoke-static {v2}, Ly1/b;->b(Ljava/lang/String;)Ly1/b;

    move-result-object v2

    sget-object v3, Ly3/h7;->a:Ly3/h7;

    const-string v4, "FIREBASE_ML_SDK"

    .line 2
    invoke-interface {v0, v4, v1, v2, v3}, Ly1/g;->a(Ljava/lang/String;Ljava/lang/Class;Ly1/b;Ly1/e;)Ly1/f;

    move-result-object v0

    return-object v0
.end method
