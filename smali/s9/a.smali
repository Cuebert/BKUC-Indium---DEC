.class public Ls9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/platform/NoObfuscate;


# instance fields
.field public final conversationId:J

.field public final endMessageId:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Ls9/a;->conversationId:J

    .line 3
    iput-object p3, p0, Ls9/a;->endMessageId:Ljava/lang/String;

    return-void
.end method
