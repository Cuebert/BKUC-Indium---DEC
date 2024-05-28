.class Lz9/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz9/d;->a(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lz9/d;


# direct methods
.method constructor <init>(Lz9/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lz9/d$b;->b:Lz9/d;

    iput-object p2, p0, Lz9/d$b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object p1, p0, Lz9/d$b;->a:Ljava/lang/String;

    const-string v0, "onFailure."

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
