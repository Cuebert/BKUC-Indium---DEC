.class public final synthetic Lda/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/b;->n:Ljava/lang/String;

    iput-object p2, p0, Lda/b;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lda/b;->n:Ljava/lang/String;

    iget-object v1, p0, Lda/b;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roblox/universalapp/cookie/CookieProtocol$OnSetCookieHandlerImpl;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
