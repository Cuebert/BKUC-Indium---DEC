.class public Ll7/b;
.super Ll9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll7/b$b;,
        Ll7/b$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Chat"

    .line 1
    invoke-direct {p0, v0}, Ll9/b;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Ll7/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll7/b$c;-><init>(Ll7/b;Ll7/b$a;)V

    const-string v2, "startChatConversation"

    invoke-virtual {p0, v2, v0}, Ll9/b;->d(Ljava/lang/String;Ll9/b$b;)V

    .line 3
    new-instance v0, Ll7/b$b;

    invoke-direct {v0, p0, v1}, Ll7/b$b;-><init>(Ll7/b;Ll7/b$a;)V

    const-string v1, "shareGameToChat"

    invoke-virtual {p0, v1, v0}, Ll9/b;->d(Ljava/lang/String;Ll9/b$b;)V

    return-void
.end method
